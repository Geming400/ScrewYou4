package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.ArgumentVisitor.class)
public class ArgumentVisitor_184193725Mixin {
        @Inject(at = @At("HEAD"), method = "visitArguments(Lcom/mojang/brigadier/ParseResults;Lnet/minecraft/commands/ArgumentVisitor$Output;Z)V", cancellable = true)
    private static void visitArguments__2082501913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2082501913L))
            info.cancel();
    }


}
