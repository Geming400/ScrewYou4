package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.gossip.GossipType.class)
public class GossipType1426184599Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/gossip/GossipType;", cancellable = true)
    private static void values_100674143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100674143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/gossip/GossipType;", cancellable = true)
    private static void valueOf__781788744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781788744L))
            info.setReturnValue(net.minecraft.world.entity.ai.gossip.GossipType.TRADING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1514393221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514393221L))
            info.setReturnValue(";Qq{I8");
    }


}
