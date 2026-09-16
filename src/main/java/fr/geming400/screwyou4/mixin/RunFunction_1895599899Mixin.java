package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.RunFunction.class)
public class RunFunction_1895599899Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_986973630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986973630L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1628943873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628943873L))
            info.setReturnValue("[\uD636J \u7D69I\u31BF}qiWV+\"\u334At3-0b[]/\u87CA\u1108ZDjF^>4ZY(46MTAQf*0Qtvmk-Q\u1DDEI\uC72DWn;!pxL]Eh\u9D30b0q\"02}&WrV{Z\u1436B?7@0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1842015307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842015307L))
            info.setReturnValue(-1561815119);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1570405895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1570405895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void function_287510073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287510073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1332922144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332922144L))
            info.setReturnValue(null);
    }


}
