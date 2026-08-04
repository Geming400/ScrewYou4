package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.EndCrystalItem.class)
public class EndCrystalItem_637317638Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1271525618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271525618L))
            info.setReturnValue(null);
    }


}
