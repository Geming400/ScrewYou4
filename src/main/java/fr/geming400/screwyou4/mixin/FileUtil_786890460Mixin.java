package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FileUtil.class)
public class FileUtil_786890460Mixin {
        @Inject(at = @At("HEAD"), method = "resolvePath(Ljava/nio/file/Path;Ljava/util/List;)Ljava/nio/file/Path;", cancellable = true)
    private static void resolvePath__689505375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689505375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAvailableName(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void findAvailableName_255554633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255554633L))
            info.setReturnValue("6Hs\u8E4DL\uD128.Eu\"O0BCdEA:>\u1AB8sb'/16p\u8C54L\uC04B\u5816Yt2,|h)?LMoa1T{_de\u7347-");
    }

    @Inject(at = @At("HEAD"), method = "isValidPathSegment(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPathSegment_1939255700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939255700L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEmptyPath(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isEmptyPath__1900785943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900785943L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createDirectoriesSafe(Ljava/nio/file/Path;)V", cancellable = true)
    private static void createDirectoriesSafe__1900789787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1900789787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sanitizeName(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void sanitizeName_1999632530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999632530L))
            info.setReturnValue("rH\uFB36\u4852$c\u53DE?IIoc9inbd1NE\u65AE\u3FEEW6gfb}4Q\u4C19\u6916gIT,P!<C*\u844CMwU1QP,\uACE0lq<'..\uA77BC");
    }

    @Inject(at = @At("HEAD"), method = "validatePath([Ljava/lang/String;)V", cancellable = true)
    private static void validatePath__1682535205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1682535205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "decomposePath(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void decomposePath_725865164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725865164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPathPortable(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isPathPortable__1900785943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900785943L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "normalizeResourcePath(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void normalizeResourcePath_1999632530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999632530L))
            info.setReturnValue("rH\uFB36\u4852$c\u53DE?IIoc9inbd1NE\u65AE\u3FEEW6gfb}4Q\u4C19\u6916gIT,P!<C*\u844CMwU1QP,\uACE0lq<'..\uA77BC");
    }

    @Inject(at = @At("HEAD"), method = "getFullResourcePath(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getFullResourcePath_1999632530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999632530L))
            info.setReturnValue("rH\uFB36\u4852$c\u53DE?IIoc9inbd1NE\u65AE\u3FEEW6gfb}4Q\u4C19\u6916gIT,P!<C*\u844CMwU1QP,\uACE0lq<'..\uA77BC");
    }

    @Inject(at = @At("HEAD"), method = "isPathPartPortable(Ljava/lang/String;)Z", cancellable = true)
    private static void isPathPartPortable_1939255700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939255700L))
            info.setReturnValue(true);
    }


}
