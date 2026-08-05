package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.VisitedEntry.class)
public class VisitedEntry1864220933Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/storage/loot/LootDataType;", cancellable = true)
    private void type__1666956410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666956410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/Validatable;", cancellable = true)
    private void value__1235687423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235687423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1045234104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045234104L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_728760958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728760958L))
            info.setReturnValue("DBj十䠊");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1902483675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902483675L))
            info.setReturnValue(-1359825434);
    }


}
