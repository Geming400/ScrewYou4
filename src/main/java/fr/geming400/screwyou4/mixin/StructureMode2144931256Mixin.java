package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.StructureMode.class)
public class StructureMode2144931256Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private static void values__997205567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997205567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private static void valueOf__1569173442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569173442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__31977909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31977909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1009470785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009470785L))
            info.setReturnValue(null);
    }


}
