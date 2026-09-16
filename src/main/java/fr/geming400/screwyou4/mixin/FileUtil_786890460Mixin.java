package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FileUtil.class)
public class FileUtil_786890460Mixin {
        @Inject(at = @At("HEAD"), method = "resolvePath(Ljava/nio/file/Path;Ljava/util/List;)Ljava/nio/file/Path;", cancellable = true)
    private static void resolvePath__1274005422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274005422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decomposePath(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void decomposePath_478924630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478924630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePath([Ljava/lang/String;)V", cancellable = true)
    private static void validatePath__858758602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-858758602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "normalizeResourcePath(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void normalizeResourcePath__393583214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393583214L))
            info.setReturnValue("s|0|\u5FB0_u0");
    }

    @Inject(at = @At("HEAD"), method = "isPathPortable(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isPathPortable_372490047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372490047L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEmptyPath(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isEmptyPath__1076898079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076898079L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "findAvailableName(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void findAvailableName__472156988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472156988L))
            info.setReturnValue("$+MpJN)x9Es1\u4BE2(=;");
    }

    @Inject(at = @At("HEAD"), method = "sanitizeName(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void sanitizeName__201978074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201978074L))
            info.setReturnValue("L*;\u0D13>Y\u2381-9|s+\u6E5Az\uB61CB'B.a2p\uBA2CEwQ\u20A7qO1W'Sw%\u9535npn\u8DBD)Ij\uFBD8}i1`o\"eiq6GZc\uAE16$\u411263ag:iLm*\u6AF3\u4E13Mjp");
    }

    @Inject(at = @At("HEAD"), method = "isPathPartPortable(Ljava/lang/String;)Z", cancellable = true)
    private static void isPathPartPortable_412345463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412345463L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidPathSegment(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPathSegment_1429112600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429112600L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createDirectoriesSafe(Ljava/nio/file/Path;)V", cancellable = true)
    private static void createDirectoriesSafe_584507913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(584507913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFullResourcePath(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getFullResourcePath_169608586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169608586L))
            info.setReturnValue("#[}uM;S\u7547`IwvQ!8m+W!UFx*M,:U");
    }


}
