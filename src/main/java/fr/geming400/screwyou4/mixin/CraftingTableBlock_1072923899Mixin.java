package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CraftingTableBlock.class)
public class CraftingTableBlock_1072923899Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1486189674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486189674L))
            info.setReturnValue(null);
    }


}
