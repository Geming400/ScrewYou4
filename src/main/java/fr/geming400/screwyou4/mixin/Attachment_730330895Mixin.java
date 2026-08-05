package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HangingSignBlock.Attachment.class)
public class Attachment_730330895Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void values_688980458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688980458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void valueOf__2005503037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005503037L))
            info.setReturnValue(net.minecraft.world.level.block.HangingSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_818539516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818539516L))
            info.setReturnValue("bmYc^gL\u806BbxCKC");
    }


}
