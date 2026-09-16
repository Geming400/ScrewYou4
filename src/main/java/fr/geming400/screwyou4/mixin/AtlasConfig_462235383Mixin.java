package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.AtlasConfig.class)
public class AtlasConfig_462235383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__446390886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446390886L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1232658907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232658907L))
            info.setReturnValue("=bJ9mFKUa!-`in\uCB7FCF?L0[C{wtwG\u21EDnk;\u9B64F4N_U=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1019587473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019587473L))
            info.setReturnValue(1232115842);
    }

    @Inject(at = @At("HEAD"), method = "additionalMetadata()Ljava/util/Set;", cancellable = true)
    private void additionalMetadata_216750306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216750306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMipmaps()Z", cancellable = true)
    private void createMipmaps_865030078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865030078L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "definitionLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void definitionLocation_1927665765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927665765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureId_849747923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849747923L))
            info.setReturnValue(null);
    }


}
