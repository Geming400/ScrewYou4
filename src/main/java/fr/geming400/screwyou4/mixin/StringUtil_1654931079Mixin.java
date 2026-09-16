package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringUtil.class)
public class StringUtil_1654931079Mixin {
        @Inject(at = @At("HEAD"), method = "isWhitespace(I)Z", cancellable = true)
    private static void isWhitespace_1828435893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828435893L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBlank(Ljava/lang/String;)Z", cancellable = true)
    private static void isBlank__1780400203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1780400203L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stripColor(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void stripColor__1669014424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669014424L))
            info.setReturnValue("\u1D431@\u3138*XMC@+\u7D106XN|QB\u671D;D?!=;\u61B5fYQx\u34B18\u1DAAunvT\u4345'Ol`");
    }

    @Inject(at = @At("HEAD"), method = "lineCount(Ljava/lang/String;)I", cancellable = true)
    private static void lineCount__58479213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58479213L))
            info.setReturnValue(-2069010175);
    }

    @Inject(at = @At("HEAD"), method = "isValidPlayerName(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPlayerName_1523088353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523088353L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter(I)Z", cancellable = true)
    private static void isAllowedChatCharacter_161428897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161428897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "filterText(Ljava/lang/String;Z)Ljava/lang/String;", cancellable = true)
    private static void filterText_1519528610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519528610L))
            info.setReturnValue("\u12D6Tad^@3f77\u4A14t^[(N;Cx8]xbAPwsos<nch7MH<gpIIJ>\u38226P\u0F251\uFDF9WN8z C`\uD4CCE6\"&\u71FErQ^I6xV,o");
    }

    @Inject(at = @At("HEAD"), method = "filterText(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void filterText_16013314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16013314L))
            info.setReturnValue("uz?\u879Bu6#RYRydE\uCA3FY8P$\uD014cS_-:\uA02Af`j:)pR\uB012^\u06984oE^Y\u89F6\u9D9Aj#.Q%\"v[Cq9,?+'uTl|\u369Emh*]L.E_mL\uBA22`:O\u5F0EBd>]4*Zm}E\u51FCG$@\u733EJC^A'");
    }

    @Inject(at = @At("HEAD"), method = "truncateStringIfNecessary(Ljava/lang/String;IZ)Ljava/lang/String;", cancellable = true)
    private static void truncateStringIfNecessary__206031993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206031993L))
            info.setReturnValue("\"Z!");
    }

    @Inject(at = @At("HEAD"), method = "endsWithNewLine(Ljava/lang/String;)Z", cancellable = true)
    private static void endsWithNewLine_615331977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615331977L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty(Ljava/lang/String;)Z", cancellable = true)
    private static void isNullOrEmpty__1360924922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360924922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "trimChatMessage(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void trimChatMessage_805249866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805249866L))
            info.setReturnValue("2M'4-$\u1D68;wx\u163A[\u7C92v;\uCE41u|]n3z\u3E91A,Jd=%_W\uBBA3Pn7YXp[Nvgv@k\"\u26A3peT9'\u1B57");
    }

    @Inject(at = @At("HEAD"), method = "formatTickDuration(IF)Ljava/lang/String;", cancellable = true)
    private static void formatTickDuration__95529998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95529998L))
            info.setReturnValue("RZ4\u56BCJ\u73B3!\u148A;o\uFE20dCz\u588DZ");
    }


}
