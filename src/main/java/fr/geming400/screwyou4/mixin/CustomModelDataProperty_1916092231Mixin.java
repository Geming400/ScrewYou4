package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CustomModelDataProperty.class)
public class CustomModelDataProperty_1916092231Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1954354476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954354476L))
            info.setReturnValue(-694554784);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get_905049144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905049144L))
            info.setReturnValue(7.579609E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__643021342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643021342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__993362807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993362807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_780632255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780632255L))
            info.setReturnValue("o!H)pฃe,BAGDx$@HU뺭EQ,Z2WSS7&#('CM/*'ae7^U튙c>;F%3oNCZVDZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1954354972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954354972L))
            info.setReturnValue(-872572373);
    }


}
