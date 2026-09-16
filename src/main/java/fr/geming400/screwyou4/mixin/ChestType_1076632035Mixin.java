package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.ChestType.class)
public class ChestType_1076632035Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private static void values__1429099068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429099068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private static void valueOf_8002763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8002763L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ChestType.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private void getOpposite_932055378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932055378L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ChestType.SINGLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1164840656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164840656L))
            info.setReturnValue("_f{1o");
    }


}
