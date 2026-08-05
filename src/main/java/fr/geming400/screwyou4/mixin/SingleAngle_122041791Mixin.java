package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.AngleArgument.SingleAngle.class)
public class SingleAngle_122041791Mixin {
        @Inject(at = @At("HEAD"), method = "getAngle(Lnet/minecraft/commands/CommandSourceStack;)F", cancellable = true)
    private void getAngle_2146773155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146773155L))
            info.setReturnValue(8.798853E8F);
    }


}
