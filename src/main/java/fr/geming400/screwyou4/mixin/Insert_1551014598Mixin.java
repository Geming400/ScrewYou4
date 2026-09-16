package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Insert.class)
public class Insert_1551014598Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode__1814565114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814565114L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.REPLACE_SECTION);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_642388329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642388329L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1973529174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973529174L))
            info.setReturnValue(",4lNWKc8F+{i(b\u1EF3ZcL%\uBB00f\u9002TZf?\u2ABA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2108366688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108366688L))
            info.setReturnValue(-415553458);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply_1212275728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212275728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset__1520832520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520832520L))
            info.setReturnValue(1215723768);
    }


}
