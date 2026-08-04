package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TradeTrigger.class)
public class TradeTrigger_605135078Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/npc/villager/AbstractVillager;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger__965348908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-965348908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_213169451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213169451L))
            info.setReturnValue(null);
    }


}
