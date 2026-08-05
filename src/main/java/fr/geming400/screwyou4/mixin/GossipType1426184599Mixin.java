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
            info.setReturnValue(net.minecraft.world.entity.ai.gossip.GossipType.MAJOR_POSITIVE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_290724128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290724128L))
            info.setReturnValue("?FZ,_\u5E66]#<}-s\u00F2wWAu7tAyh\"d\u1D82us!X\u3BD9r\u3C41\u3943g!::\u63B8;n\uFC492}\u5254\u9A92*\u7141_?++cp$Tm[*j@RO\u76F8\u75CA:*iTLA2L.");
    }


}
