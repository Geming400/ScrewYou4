package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.gossip.GossipType.class)
public class GossipType1426184599Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/gossip/GossipType;", cancellable = true)
    private static void values_1063189181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063189181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/gossip/GossipType;", cancellable = true)
    private static void valueOf__1221985824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221985824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_290724128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290724128L))
            info.setReturnValue(null);
    }


}
