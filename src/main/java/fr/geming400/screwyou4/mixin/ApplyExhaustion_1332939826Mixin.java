package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyExhaustion.class)
public class ApplyExhaustion_1332939826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1576515212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576515212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_197479850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197479850L))
            info.setReturnValue("3\uCE051C.ER;FO\uFB4EB/\u1B7B5RaS;A\"R3qR0;\u5BDBt<1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1371202567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371202567L))
            info.setReturnValue(-597680850);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1721275700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1721275700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_1465019424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465019424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1226173747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226173747L))
            info.setReturnValue(null);
    }


}
