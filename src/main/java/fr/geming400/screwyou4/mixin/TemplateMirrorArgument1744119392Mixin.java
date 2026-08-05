package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TemplateMirrorArgument.class)
public class TemplateMirrorArgument1744119392Mixin {
        @Inject(at = @At("HEAD"), method = "getMirror(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private static void getMirror__1107137968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107137968L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.FRONT_BACK);
    }

    @Inject(at = @At("HEAD"), method = "templateMirror()Lnet/minecraft/commands/arguments/StringRepresentableArgument;", cancellable = true)
    private static void templateMirror_823351517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823351517L))
            info.setReturnValue(null);
    }


}
