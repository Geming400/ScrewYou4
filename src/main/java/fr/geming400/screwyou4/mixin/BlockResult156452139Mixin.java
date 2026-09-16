package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.BlockResult.class)
public class BlockResult156452139Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__752174129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752174129L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_926875664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926875664L))
            info.setReturnValue("a4}5gXj0Y?X,g`\uCB1ATC\u3884Qy5<)O]\u28C6Z!z><OQ9HJb\uFCC8O[)GWZ/cN9!/t\uA84Dfs\u5435@$ }\u9A21*Q\uB6C14ltI;;\u2A33\u1E53JrDI??yd\uFF07N'\u44DCk\u77D0F_\u4DB6qn@{\"H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_713804230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713804230L))
            info.setReturnValue(958881082);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__1137038336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137038336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState__424936931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424936931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__1340120925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340120925L))
            info.setReturnValue(null);
    }


}
