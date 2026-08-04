package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SkullBlock.Types.class)
public class Types725186945Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/SkullBlock$Types;", cancellable = true)
    private static void values__331745827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331745827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/SkullBlock$Types;", cancellable = true)
    private static void valueOf_1842273050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842273050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__410273526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410273526L))
            info.setReturnValue(null);
    }


}
