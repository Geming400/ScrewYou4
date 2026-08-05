package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.Value.class)
public class Value_1117925710Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void type__831733938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831733938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private void value__1317349075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317349075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_209299441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209299441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1888349234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888349234L))
            info.setReturnValue("n=>UFr/\u69B6,0a\uAC1C:& o\uACA5o#J*3C)`;;FCU%-\u218Bq\u67806f#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1675277800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675277800L))
            info.setReturnValue(-2053303693);
    }

    @Inject(at = @At("HEAD"), method = "createUnchecked(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/ExpirableValue;)Lnet/minecraft/world/entity/ai/memory/MemoryMap$Value;", cancellable = true)
    private static void createUnchecked_205824745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205824745L))
            info.setReturnValue(null);
    }


}
