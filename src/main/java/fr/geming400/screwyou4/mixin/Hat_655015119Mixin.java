package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.class)
public class Hat_655015119Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private static void values__1215364035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215364035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private static void valueOf_1917260246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917260246L))
            info.setReturnValue(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_743223740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743223740L))
            info.setReturnValue("C;U%OV5.eM6eKqT_/7N,VZl=K|B>KD5^QV&{GG\uA573C%\u7788\u8E39@\u22F6#DkejG*!PgZm\u891688O3<m7\uBE2Bl|!\u4C5DExrn\u1A15S");
    }


}
