package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.WallSide.class)
public class WallSide_1934780243Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_799319771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799319771L))
            info.setReturnValue("7sP<6C{fc2'017\"-C-/N4V8[!Hi랢ie曳!`#CI?꣗");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/WallSide;", cancellable = true)
    private static void values_1715204372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715204372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/WallSide;", cancellable = true)
    private static void valueOf_1389928567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389928567L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.WallSide.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_799319771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799319771L))
            info.setReturnValue("7sP<6C{fc2'017\"-C-/N4V8[!Hi랢ie曳!`#CI?꣗");
    }


}
