package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.PlaySoundEffect.class)
public class PlaySoundEffect1780516558Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1128938479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128938479L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_645056583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645056583L))
            info.setReturnValue("NSӲ=Pᾱ䲢㪩筊ccT:;Hvu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1818779300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818779300L))
            info.setReturnValue(-2141333741);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1273698967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1273698967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "volume()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void volume__1581231158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581231158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvents()Ljava/util/List;", cancellable = true)
    private void soundEvents__888113922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888113922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__778597014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778597014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pitch()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void pitch__1581231158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581231158L))
            info.setReturnValue(null);
    }


}
