package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PlainSignBlock.Attachment.class)
public class Attachment2064025291Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private static void values__345207765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345207765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private static void valueOf__670483570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670483570L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.GROUND);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_928564820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928564820L))
            info.setReturnValue("3ṂmꝄPBmMlo}{<:5iy컭c)FXXᅸ\"D3}7䀞$⠗AP5]<+JỢXl㜅agS]l蕸4bY^: /浏ofꏅvWㆧ");
    }


}
