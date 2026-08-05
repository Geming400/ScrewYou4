package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.TagResult.class)
public class TagResult632380920Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2017893179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017893179L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__503079055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503079055L))
            info.setReturnValue("8.><xs=%<;#.dpjBh<5Zt^iN䷴Up");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_670643662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670643662L))
            info.setReturnValue(934522627);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void tag__2042633332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042633332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__937842000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937842000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vagueProperties()Ljava/util/Map;", cancellable = true)
    private void vagueProperties__1372242720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372242720L))
            info.setReturnValue(null);
    }


}
