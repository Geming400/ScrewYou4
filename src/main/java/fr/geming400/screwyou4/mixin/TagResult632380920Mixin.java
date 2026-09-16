package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.TagResult.class)
public class TagResult632380920Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__276245348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276245348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1402804445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402804445L))
            info.setReturnValue("_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1189733011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189733011L))
            info.setReturnValue(-841339081);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void tag__613073754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613073754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__864192144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864192144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vagueProperties()Ljava/util/Map;", cancellable = true)
    private void vagueProperties_669730177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669730177L))
            info.setReturnValue(null);
    }


}
