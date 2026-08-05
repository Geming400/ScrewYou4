package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SetBlockProperties.class)
public class SetBlockProperties337554656Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1723066915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723066915L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__797905319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797905319L))
            info.setReturnValue("\u4BEFz?\uD473\u4C8A*2X7%FKZO|\"B.WYXBK'\uA6D2oGt\u4151\uD00CLt\uA228/yb&Rp-I\uAC6B\u8F467-?<\u9AAFzM\uFE3EO(&Jr\u9FD6\uD7220\uC139'^m^(-E1v\uD756%?\u870C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_375817398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375817398L))
            info.setReturnValue(1059529488);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1578306427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1578306427L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__46843808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46843808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void properties_313492867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313492867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2073408380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073408380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent_583016078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583016078L))
            info.setReturnValue(null);
    }


}
