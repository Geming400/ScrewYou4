package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.DialogArgument.class)
public class DialogArgument691778426Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1653038520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653038520L))
            info.setReturnValue(new java.lang.Object());
    }


}
