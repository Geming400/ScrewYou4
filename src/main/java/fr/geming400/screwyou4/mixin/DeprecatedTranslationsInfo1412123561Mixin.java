package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.locale.DeprecatedTranslationsInfo.class)
public class DeprecatedTranslationsInfo1412123561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_503497293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503497293L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2112420210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112420210L))
            info.setReturnValue("*\u52E0<\u5FAE7\u67D0!}g=y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1969475652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969475652L))
            info.setReturnValue(-1242725274);
    }

    @Inject(at = @At("HEAD"), method = "removed()Ljava/util/List;", cancellable = true)
    private void removed__1265671623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265671623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renamed()Ljava/util/Map;", cancellable = true)
    private void renamed__159640597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159640597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Ljava/util/Map;)V", cancellable = true)
    private void applyToMap_416411178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(416411178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadFromDefaultResource()Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromDefaultResource__974039198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974039198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromResource(Ljava/lang/String;)Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromResource_696477709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696477709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromJson(Ljava/io/InputStream;)Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromJson__1266434334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266434334L))
            info.setReturnValue(null);
    }


}
