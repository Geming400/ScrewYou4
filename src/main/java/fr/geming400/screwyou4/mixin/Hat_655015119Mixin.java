package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.class)
public class Hat_655015119Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private static void values__2003084261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003084261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private static void valueOf_2117172222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117172222L))
            info.setReturnValue(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.FULL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__480445353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480445353L))
            info.setReturnValue("0\u282Cea-xb'iYkvobV/U\u5CE4c eaW>X$BrjObq\u0958@F=epl:<w9,-NXlB\u9E41q|\u264BNqk9V\uFEA2ze?e\u3A717zX9\u6022Z:qF\u7243u{7,',#");
    }


}
