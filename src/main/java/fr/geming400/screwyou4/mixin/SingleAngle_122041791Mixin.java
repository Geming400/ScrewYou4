package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.AngleArgument.SingleAngle.class)
public class SingleAngle_122041791Mixin {
        @Inject(at = @At("HEAD"), method = "getAngle(Lnet/minecraft/commands/CommandSourceStack;)F", cancellable = true)
    private void getAngle__1604732480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604732480L))
            info.setReturnValue(5.133513E8F);
    }


}
