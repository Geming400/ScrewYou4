package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HangingSignBlock.Attachment.class)
public class Attachment_730330895Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void values_1322530120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322530120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void valueOf__2029873173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029873173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__405129577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405129577L))
            info.setReturnValue(null);
    }


}
