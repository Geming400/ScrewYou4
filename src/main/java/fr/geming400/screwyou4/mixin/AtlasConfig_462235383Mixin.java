package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.AtlasConfig.class)
public class AtlasConfig_462235383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1847747641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847747641L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__673224593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673224593L))
            info.setReturnValue("s*k\u6E04lwY\u853E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_500498124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500498124L))
            info.setReturnValue(2078163243);
    }

    @Inject(at = @At("HEAD"), method = "additionalMetadata()Ljava/util/Set;", cancellable = true)
    private void additionalMetadata__1366800104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366800104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definitionLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void definitionLocation__1980831171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980831171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMipmaps()Z", cancellable = true)
    private void createMipmaps_500513965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500513965L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "textureId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureId__1980831171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980831171L))
            info.setReturnValue(null);
    }


}
