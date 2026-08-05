package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PlainSignBlock.Attachment.class)
public class Attachment2064025291Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private static void values__765978291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765978291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private static void valueOf_804400486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804400486L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2142733383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142733383L))
            info.setReturnValue("B@fFLO*+V\uA575=3'\u81DA\u71E7w8\u89B23\u2BA7;c.`]_U<Q{ `\u0724|G8(AaYbgv=TV|<8W7\uD5E4a=<Za..>I/x\u835BYkr:YVQYMil");
    }


}
