package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.class)
public class Anchor710016430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void values_362437299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362437299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void valueOf__1562172422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562172422L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void apply__724023465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724023465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void apply_1162739374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162739374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void getByName__219286710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219286710L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }


}
