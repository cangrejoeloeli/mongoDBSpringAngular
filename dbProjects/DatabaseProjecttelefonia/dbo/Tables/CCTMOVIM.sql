CREATE TABLE [dbo].[CCTMOVIM] (
    [CAI]         VARCHAR (50)    NULL,
    [CONCOD]      INT             NOT NULL,
    [CTACOD]      INT             NOT NULL,
    [CTANOM]      VARCHAR (65)    NULL,
    [FORMAPAGO]   INT             NULL,
    [HISFACCICLO] INT             NULL,
    [LIQCOD]      VARCHAR (16)    NULL,
    [MOVCTA]      INT             NOT NULL,
    [MOVFEC]      DATETIME        NOT NULL,
    [MOVGRA]      DATETIME        NULL,
    [MOVICC]      INT             NULL,
    [MOVICL]      CHAR (1)        NULL,
    [MOVICT]      INT             NULL,
    [MOVIMP]      DECIMAL (11, 2) NULL,
    [MOVINC]      DECIMAL (19)    NULL,
    [MOVIPV]      INT             NULL,
    [MOVLET]      CHAR (1)        NOT NULL,
    [MOVMAR]      VARCHAR (2)     NULL,
    [MOVNET]      DECIMAL (11, 2) NULL,
    [MOVNETGA]    DECIMAL (11, 2) NULL,
    [MOVNETIB]    DECIMAL (11, 2) NULL,
    [MOVNPV]      INT             NOT NULL,
    [MOVNRO]      INT             NOT NULL,
    [MOVPAG]      VARCHAR (1)     NULL,
    [MOVREF__1]   VARCHAR (20)    NULL,
    [MOVREF__2]   VARCHAR (20)    NULL,
    [MOVREF__3]   VARCHAR (20)    NULL,
    [MOVSAL]      DECIMAL (11, 2) NULL,
    [MOVVTO]      DATETIME        NULL,
    [NOVCON]      INT             NULL,
    [ORIITEM]     CHAR (2)        NULL,
    [REGFEC]      DATETIME        NULL,
    [SERCOD]      DECIMAL (19)    NULL,
    [SISCOD]      VARCHAR (2)     NOT NULL,
    [USUCOD]      VARCHAR (25)    NOT NULL,
    [ZONCOD]      INT             NULL,
    PRIMARY KEY CLUSTERED ([SISCOD] ASC, [CTACOD] ASC, [USUCOD] ASC, [MOVFEC] ASC, [CONCOD] ASC, [MOVNPV] ASC, [MOVNRO] ASC, [MOVCTA] ASC, [MOVLET] ASC),
    UNIQUE NONCLUSTERED ([MOVLET] ASC, [MOVNPV] ASC, [MOVNRO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_ctacod_1DB46302]
    ON [dbo].[CCTMOVIM]([CTACOD] ASC);


GO

