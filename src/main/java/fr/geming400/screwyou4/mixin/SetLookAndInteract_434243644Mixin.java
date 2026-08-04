package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetLookAndInteract.class)
public class SetLookAndInteract_434243644Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;I)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1161559021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161559021L))
            info.setReturnValue(null);
    }


}
