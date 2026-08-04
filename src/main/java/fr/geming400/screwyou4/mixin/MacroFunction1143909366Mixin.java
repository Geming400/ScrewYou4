package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.functions.MacroFunction.class)
public class MacroFunction1143909366Mixin {
        @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1299157187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299157187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/nbt/CompoundTag;Lcom/mojang/brigadier/CommandDispatcher;)Lnet/minecraft/commands/functions/InstantiatedFunction;", cancellable = true)
    private void instantiate_1437850210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437850210L))
            info.setReturnValue(null);
    }


}
