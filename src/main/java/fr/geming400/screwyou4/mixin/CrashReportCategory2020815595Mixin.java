package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReportCategory.class)
public class CrashReportCategory2020815595Mixin {
        @Inject(at = @At("HEAD"), method = "fillInStackTrace(I)I", cancellable = true)
    private void fillInStackTrace__1060247222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060247222L))
            info.setReturnValue(-1680176612);
    }

    @Inject(at = @At("HEAD"), method = "getStacktrace()[Ljava/lang/StackTraceElement;", cancellable = true)
    private void getStacktrace_1547102315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547102315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateStackTrace(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", cancellable = true)
    private void validateStackTrace__419049438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419049438L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDetails(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void getDetails__1206369217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206369217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Ljava/lang/Object;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void setDetail__387737360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387737360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Lnet/minecraft/CrashReportDetail;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void setDetail_1001800063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001800063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDetailError(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private void setDetailError_1071706431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1071706431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void formatLocation_1948705625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948705625L))
            info.setReturnValue("㳽[U-J/e0r滎+tP2뽣♈}Jj(y.RW$99+s*珞*눖vH=2q鬺Y6$$hI.v:qD%NN鹫賴3C,,㧧(E*%ht-sw+)/VMiN#?犒y!陚");
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;DDD)Ljava/lang/String;", cancellable = true)
    private static void formatLocation_982011897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982011897L))
            info.setReturnValue("唤乀gSGO=sQ\"J큽^蚖!GS$a'ex>vPy}kvὟ:!R2#xzikD>LKtL{K9,\"}_;仮cz7[dR[/*h&E馔醚-78fHஷ+_!径&|h[c8");
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;III)Ljava/lang/String;", cancellable = true)
    private static void formatLocation_975486388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975486388L))
            info.setReturnValue("ꈇc긓&ox&┢[Zymi4衛GM쎑&\"㉪khqr>A]DY0%{[|?E4\"%0MCSgcyw;ᵠgWW極)뺲ඈ<!g=머Y칲hwY⍬y$+jL+╔");
    }

    @Inject(at = @At("HEAD"), method = "populateBlockDetails(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void populateBlockDetails_1562045034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1562045034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "populateBlockLocationDetails(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private static void populateBlockLocationDetails__1350635801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350635801L))
            info.setReturnValue(null);
    }


}
