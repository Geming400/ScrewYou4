package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ChangeItemDamage.class)
public class ChangeItemDamage_971934924Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_63308655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63308655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1742358448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742358448L))
            info.setReturnValue("x&SQ#',{\u2FA7LLe\u527BD+G\u3347IRq(\uC6DB`t!-ddww%8\uC325pV:iX\u1761S3p\u469FfoUQIb4\uACA8fYs3WfJ&7i\u12C2=\u679E\u2CC7c>!Y:0\u42C6kiEmL=9.WI6[w\u4E11\u7F78\u99D8FX,rZY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1529287014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529287014L))
            info.setReturnValue(1038838440);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_646740920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646740920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_2139266834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139266834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2038380177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038380177L))
            info.setReturnValue(null);
    }


}
