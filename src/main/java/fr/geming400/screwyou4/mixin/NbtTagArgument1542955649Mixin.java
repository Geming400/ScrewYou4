package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.NbtTagArgument.class)
public class NbtTagArgument1542955649Mixin {
        @Inject(at = @At("HEAD"), method = "getNbtTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void getNbtTag_1102502298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102502298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbtTag()Lnet/minecraft/commands/arguments/NbtTagArgument;", cancellable = true)
    private static void nbtTag_814293472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814293472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1027397648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027397648L))
            info.setReturnValue(null);
    }


}
