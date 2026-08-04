package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.StateDefinition.Builder.class)
public class Builder1330744757Mixin {
        @Inject(at = @At("HEAD"), method = "add([Lnet/minecraft/world/level/block/state/properties/Property;)Lnet/minecraft/world/level/block/state/StateDefinition$Builder;", cancellable = true)
    private void add_1019006161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019006161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/StateDefinition$Factory;)Lnet/minecraft/world/level/block/state/StateDefinition;", cancellable = true)
    private void create__1823151502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823151502L))
            info.setReturnValue(null);
    }


}
