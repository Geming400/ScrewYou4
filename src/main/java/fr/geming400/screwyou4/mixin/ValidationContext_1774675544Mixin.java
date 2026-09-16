package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.class)
public class ValidationContext_1774675544Mixin {
        @Inject(at = @At("HEAD"), method = "resolver()Lnet/minecraft/core/HolderGetter$Provider;", cancellable = true)
    private void resolver__1112192055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112192055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forChild(Lnet/minecraft/util/ProblemReporter$PathElement;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forChild_1649427556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649427556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reporter()Lnet/minecraft/util/ProblemReporter;", cancellable = true)
    private void reporter_1377046527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377046527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forField(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forField__1504842707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504842707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMapField(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forMapField_1763561817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763561817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forIndexedField(Ljava/lang/String;I)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forIndexedField__1126450491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126450491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowsReferences()Z", cancellable = true)
    private void allowsReferences__430081316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430081316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "reportProblem(Lnet/minecraft/util/ProblemReporter$Problem;)V", cancellable = true)
    private void reportProblem_1166940844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1166940844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasVisitedElement(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void hasVisitedElement__1827896514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827896514L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "enterElement(Lnet/minecraft/util/ProblemReporter$PathElement;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void enterElement__1118197229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118197229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateContextUsage(Lnet/minecraft/world/level/storage/loot/LootContextUser;)V", cancellable = true)
    private void validateContextUsage__1113932170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1113932170L))
            info.cancel();
    }


}
