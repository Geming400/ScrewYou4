package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.class)
public class Anchor710016430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void values__1472359659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472359659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void valueOf_1977320658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977320658L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void apply__1221276567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221276567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void apply__1300122176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300122176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void getByName_1977320658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977320658L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }


}
