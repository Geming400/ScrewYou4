package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.PlaySoundEffect.class)
public class PlaySoundEffect1780516558Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_871890290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871890290L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1744027213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744027213L))
            info.setReturnValue("K:aQc>+4\u6B22X\u0648Q>:\u74B8FRe\u7832'L]\u4E76zE/{L=?1XPHj)U\u36F3tXws\uA85C\u2F0D9dt6?f]y\uA4E9#p`1m\u3649'`Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1957098647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957098647L))
            info.setReturnValue(1784094479);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1455322555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1455322555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "volume()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void volume__1100830480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100830480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvents()Ljava/util/List;", cancellable = true)
    private void soundEvents__1835864058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835864058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1448005484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448005484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pitch()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void pitch__694675318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694675318L))
            info.setReturnValue(null);
    }


}
