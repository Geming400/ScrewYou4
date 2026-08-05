package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.locale.DeprecatedTranslationsInfo.class)
public class DeprecatedTranslationsInfo1412123561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1497331476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497331476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_276663586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276663586L))
            info.setReturnValue(">d51?1@NnL+\u7972}>ve(z\"1k1s;=\u3EEDrc$2EN<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1450386303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450386303L))
            info.setReturnValue(1784888065);
    }

    @Inject(at = @At("HEAD"), method = "removed()Ljava/util/List;", cancellable = true)
    private void removed__1256506919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256506919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renamed()Ljava/util/Map;", cancellable = true)
    private void renamed__592500079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592500079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Ljava/util/Map;)V", cancellable = true)
    private void applyToMap__368448617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-368448617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadFromResource(Ljava/lang/String;)Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromResource_666833835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666833835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromDefaultResource()Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromDefaultResource_438268833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438268833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromJson(Ljava/io/InputStream;)Lnet/minecraft/locale/DeprecatedTranslationsInfo;", cancellable = true)
    private static void loadFromJson_1766854186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766854186L))
            info.setReturnValue(null);
    }


}
