package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TemplateRotationArgument.class)
public class TemplateRotationArgument_2026228257Mixin {
        @Inject(at = @At("HEAD"), method = "getRotation(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void getRotation__681503994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681503994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "templateRotation()Lnet/minecraft/commands/arguments/TemplateRotationArgument;", cancellable = true)
    private static void templateRotation_846634523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846634523L))
            info.setReturnValue(null);
    }


}
