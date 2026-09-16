package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.LocationBasedEffects.class)
public class LocationBasedEffects1957746586Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1049120318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049120318L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1566797185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566797185L))
            info.setReturnValue("{\u00EE@z\u6F40SIxMI=idw\u8CEDUL>\u1D99F\u7968\"us)4r'<r\u63D0#fd\u9E47nX@@kNMu\u8A2DRS}/!3J1\"RQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1779868619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779868619L))
            info.setReturnValue(-1350999817);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects__1785943604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1785943604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChangedBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Z)V", cancellable = true)
    private void onChangedBlock_829381415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(829381415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1270775456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270775456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDeactivated(Lnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void onDeactivated__1784745435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784745435L))
            info.cancel();
    }


}
