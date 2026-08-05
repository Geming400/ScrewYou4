package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.ChestType.class)
public class ChestType_1076632035Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private static void values__1270114650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270114650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private static void valueOf_1531237283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531237283L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ChestType.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private void getOpposite_2113404149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113404149L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ChestType.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__58828437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58828437L))
            info.setReturnValue("nU3cIfStqb9Hox@PHc!Ak ;ME8=&");
    }


}
